import { Link } from "react-router-dom";

export default function LinkButton({ name, pageLink, onClick, data }) {
  return (
    <Link to={{ pathname: pageLink, state: data }}>
      <button onClick={onClick}>{name}</button>
    </Link>
  );
}
