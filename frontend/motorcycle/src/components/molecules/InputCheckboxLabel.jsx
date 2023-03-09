import InputCheckbox from "../atoms/InputCheckbox";
import Label from "../atoms/Label";

export default function InputCheckboxLabel({ data }) {
    return (
        <div>
            <Label name={data.name}/>
            <InputCheckbox data={data}/>
        </div>
    )
}