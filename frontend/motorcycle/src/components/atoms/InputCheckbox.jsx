export default function InputCheckbox({ data, onChange }) {
  return (
    <input
      type="checkbox"
      id={data.name}
      defaultChecked={data.checked}
      onChange={onChange}
    />
  );
}
