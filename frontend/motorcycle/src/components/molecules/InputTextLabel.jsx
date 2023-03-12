import InputText from "../atoms/InputText";
import Label from "../atoms/Label";

export default function InputTextLabel({ data, onChange }) {
  return (
    <div>
      <Label name={data} />
      <InputText id={data} onChange={onChange} />
    </div>
  );
}
