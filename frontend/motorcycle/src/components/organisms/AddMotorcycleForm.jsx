import SubmitButton from "../atoms/SubmitButton";
import InputCheckboxLabel from "../molecules/InputCheckboxLabel";
import InputTextLabel from "../molecules/InputTextLabel";
import OptionSelectLabel from "../molecules/OptionSelectLabel";
import { FormData } from "../resources/FormData";
import { useState, useCallback } from "react";

const initialMotorcycle = {
  manufacturer: null,
  modelType: null,
  name: null,
  productionYear: null,
  engine: null,
  displacement: null,
  cooling: null,
  horsepower: null,
  drive: null,
  fuelCapacity: null,
  isUsed: false,
};

export default function AddMotorcycleForm() {
  const [motorcycle, setMotorcycle] = useState(initialMotorcycle);

  const formData = FormData;

  console.log(motorcycle);

  const handleSubmit = (e) => {
    e.preventDefault();
    console.log(motorcycle);
    fetch("/motorcycle", {
      method: "POST",
      body: JSON.stringify(motorcycle),
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
      setMotorcycle({ ...motorcycle, [type]: value });
    },
    [motorcycle]
  );

  return (
    <form onSubmit={handleSubmit}>
      <OptionSelectLabel
        data={formData.manufacturers}
        onChange={handleChange("manufacturer")}
      />
      <OptionSelectLabel
        data={formData.models}
        onChange={handleChange("modelType")}
      />
      <InputTextLabel data={"Name"} onChange={handleChange("name")} />
      <InputTextLabel
        data={"Production Year"}
        onChange={handleChange("productionYear")}
      />
      <InputTextLabel data={"Engine"} onChange={handleChange("engine")} />
      <InputTextLabel
        data={"Displacement"}
        onChange={handleChange("displacement")}
      />
      <InputTextLabel data={"Cooling"} onChange={handleChange("cooling")} />
      <InputTextLabel
        data={"Horsepower"}
        onChange={handleChange("horsepower")}
      />
      <OptionSelectLabel
        data={formData.drives}
        onChange={handleChange("drive")}
      />
      <InputTextLabel
        data={"Fuel Capacity"}
        onChange={handleChange("fuelCapacity")}
      />
      <InputCheckboxLabel
        data={formData.checkbox}
        onChange={handleChange("isUsed")}
      />
      <SubmitButton data={formData.submit} />
    </form>
  );
}
