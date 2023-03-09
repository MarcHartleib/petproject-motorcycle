import LinkButton from "../atoms/LinkButton";
import AddMotorcycleForm from "../organisms/AddMotorcycleForm";

import NavBar from "../organisms/NavBar";

export default function AddMotorcyclePage() {
  return (
    <div>
      <NavBar>
        <LinkButton name={"Home"} pageLink={"/"} />
        <LinkButton name={"Logout"} />
      </NavBar>
      <AddMotorcycleForm />
    </div>
  );
}
