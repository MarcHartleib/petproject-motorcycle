import LinkButton from "../atoms/LinkButton";
import NavBar from "../organisms/NavBar";
import { useParams } from "react-router-dom";
import { useState, useEffect } from "react";

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

  console.log(motorcycle);

  return (
    <div>
      <NavBar>
        <LinkButton name={"Home"} pageLink={"/"} />
        <LinkButton name={"Logout"} />
      </NavBar>
    </div>
  );
}
