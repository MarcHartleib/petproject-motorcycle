export default function InputText({ id, onChange, defaultValue }) {
  return (
    <input
      id={id}
      type="text"
      onChange={onChange}
      defaultValue={defaultValue}
    ></input>
  );
}
