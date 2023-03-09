import LinkButton from "../atoms/LinkButton";
import Landing from "../organisms/Landing";

export default function LandingPage(onClick) {
  return (
    <Landing>
      <LinkButton
        name={"Motorcycles"}
        pageLink={"/motorcycles"}
        onClick={onClick}
      />
      <LinkButton name={"Add Motorcycle"} pageLink={"/add-motorcycle"} />
      <LinkButton name={"Logout"} />
    </Landing>
  );
}
