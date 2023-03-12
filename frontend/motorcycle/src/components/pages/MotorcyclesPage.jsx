import LinkButton from "../atoms/LinkButton";
import NavBar from "../organisms/NavBar";
import Motorcycle from "../atoms/Motorcycle";
import DeleteButton from "../atoms/DeleteButton";

export default function MotorcyclesPage(data) {
  function handleDelete(mocy) {
    fetch("/motorcycle", {
      method: "DELETE",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(mocy),
    }).then((res) =>
      res.status >= 400 ? alert("Error") : (window.location = "/motorcycles")
    );
  }

  if (!data) {
    return (
      <div>
        <NavBar>
          <LinkButton name={"Home"} pageLink={"/"} />
          <LinkButton name={"Logout"} />
        </NavBar>
        <p>No Data</p>
      </div>
    );
  } else {
    return (
      <div>
        <NavBar>
          <LinkButton name={"Home"} pageLink={"/"} />
          <LinkButton name={"Logout"} />
        </NavBar>
        {data.map((mocy) => (
          <div key={mocy.id}>
            <Motorcycle mocy={mocy} />
            <DeleteButton onClick={() => handleDelete(mocy)} />
          </div>
        ))}
      </div>
    );
  }
}
