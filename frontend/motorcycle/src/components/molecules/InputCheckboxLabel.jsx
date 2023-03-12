import InputCheckbox from "../atoms/InputCheckbox";
import Label from "../atoms/Label";

export default function InputCheckboxLabel({ data, onChange }) {
  return (
    <div>
      <Label name={data.name} />
      <InputCheckbox data={data} onChange={onChange} />
    </div>
  );
}
