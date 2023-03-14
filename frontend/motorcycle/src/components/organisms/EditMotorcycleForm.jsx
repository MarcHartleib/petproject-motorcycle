import SubmitButton from "../atoms/SubmitButton";
import InputCheckboxLabel from "../molecules/InputCheckboxLabel";
import OptionSelectLabel from "../molecules/OptionSelectLabel";
import InputTextLabel from "../molecules/InputTextLabel";
import { FormData } from "../resources/FormData";
import { useState, useCallback } from "react";

export default function EditMotorcycleForm({ data }) {
  const [updatedMotorcycle, setUpdatedMotorcycle] = useState(data);

  const formData = FormData;

  const handleSubmit = (e) => {
    e.preventDefault();
    console.log(updatedMotorcycle);
    fetch("/motorcycle", {
      method: "POST",
      body: JSON.stringify(updatedMotorcycle),
      headers: { "Content-Type": "application/json" },
    }).then((res) =>
      res.status >= 400 ? alert("Error") : (window.location = "/motorcycles")
    );
  };

  const handleChange = useCallback(
    (type) => (event) => {
      const value =
        event.target.type === "checkbox"
          ? event.target.checked
          : event.target.value;
      setUpdatedMotorcycle({ ...updatedMotorcycle, [type]: value });
    },
    [updatedMotorcycle]
  );

  return (
    <form onSubmit={handleSubmit}>
      <OptionSelectLabel
        data={formData.manufacturers}
        onChange={handleChange("manufacturer")}
        defaultValue={data.manufacturer}
      />
      <OptionSelectLabel
        data={formData.models}
        onChange={handleChange("modelType")}
        defaultValue={data.modelType}
      />
      <InputTextLabel
        data={"Name"}
        defaultValue={data.name}
        onChange={handleChange("name")}
      />
      <InputTextLabel
        data={"Production Year"}
        defaultValue={data.productionYear}
        onChange={handleChange("productionYear")}
      />
      <InputTextLabel
        data={"Engine"}
        defaultValue={data.engine}
        onChange={handleChange("engine")}
      />
      <InputTextLabel
        data={"Displacement"}
        defaultValue={data.displacement}
        onChange={handleChange("displacement")}
      />
      <InputTextLabel
        data={"Cooling"}
        defaultValue={data.cooling}
        onChange={handleChange("cooling")}
      />
      <InputTextLabel
        data={"Horsepower"}
        defaultValue={data.horsepower}
        onChange={handleChange("horsepower")}
      />
      <OptionSelectLabel
        data={formData.drives}
        onChange={handleChange("drive")}
        defaultValue={data.drive}
      />
      <InputTextLabel
        data={"Fuel Capacity"}
        defaultValue={data.fuelCapacity}
        onChange={handleChange("fuelCapacity")}
      />
      <InputCheckboxLabel data={data.used} onChange={handleChange("used")} />
      <SubmitButton data={formData.submit} />
    </form>
  );
}
