import Label from "../atoms/Label";
import Option from "../atoms/Option";

export default function OptionSelectLabel({ data, onChange }) {
  return (
    <div>
      <Label name={data.title} />
      <Option id={data.title} options={data.list} onChange={onChange} />
    </div>
  );
}
