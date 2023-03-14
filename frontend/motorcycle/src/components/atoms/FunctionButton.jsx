export default function FunctionButton({ onClick, name }) {
  return (
    <button type="button" onClick={onClick}>
      {name}
    </button>
  );
}
