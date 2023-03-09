import SubmitButton from "../atoms/SubmitButton";
import InputCheckboxLabel from "../molecules/InputCheckboxLabel";
import InputTextLabel from "../molecules/InputTextLabel";
import OptionSelectLabel from "../molecules/OptionSelectLabel";
import { FormData } from "../resources/FormData";

export default function AddMotorcycleForm() {
  const formData = FormData;

  const handleSubmit = (e) => {
    e.preventDefault();
    console.log("test");
  };

  return (
    <form onSubmit={handleSubmit}>
      <OptionSelectLabel data={formData.manufacturers} />
      <OptionSelectLabel data={formData.models} />
      {formData.inputs.map((data, index) => (
        <InputTextLabel key={index} data={data} />
      ))}
      <InputCheckboxLabel data={formData.checkbox} />
      <SubmitButton data={formData.submit} />
    </form>
  );
}
