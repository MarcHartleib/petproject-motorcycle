import LinkButton from "../atoms/LinkButton";
import NavBar from "../organisms/NavBar";
import { useParams } from "react-router-dom";
import { useState, useEffect } from "react";
import EditMotorcycleForm from "../organisms/EditMotorcycleForm";

export default function EditMotorcyclePage() {
  const { id } = useParams();
  const [motorcycle, setMotorcyle] = useState(null);

  useEffect(() => {
    const fetchMotorcycle = async () => {
      const response = await fetch(`/motorcycle/${id}`);
      const data = await response.json();
      setMotorcyle(data);
    };
    fetchMotorcycle();
  }, [id]);

  return (
    <div>
      <NavBar>
        <LinkButton name={"Home"} pageLink={"/"} />
        <LinkButton name={"Logout"} />
      </NavBar>
      {motorcycle ? (
        <EditMotorcycleForm data={motorcycle} />
      ) : (
        <p>Loading...</p>
      )}
    </div>
  );
}
