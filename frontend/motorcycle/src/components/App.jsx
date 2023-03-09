import { Routes, Route } from "react-router-dom";
import { useState, useEffect } from "react";
import LandingPage from "./pages/LandingPage";
import MotorcyclesPage from "./pages/MotorcyclesPage";
import TemplateLanding from "./templates/TemplateLanding";
import TemplateMotorcycles from "./templates/TemplateMotorcycles";
import TemplateAddMotorcycle from "./templates/TemplateAddMotorcycle";
import AddMotorcyclePage from "./pages/AddMotorcyclePage";

async function fetchMotoryclyces() {
  const response = await fetch("/motorcycle");
  return await response.json();
}

export default function App() {
  const [data, setData] = useState(null);

  useEffect(refetchMotorcycles, []);

  function refetchMotorcycles() {
    fetchMotoryclyces().then(setData);
  }

  return (
    <Routes>
      <Route
        path="/"
        element={TemplateLanding(LandingPage(refetchMotorcycles))}
      ></Route>
      <Route
        path="/motorcycles"
        element={TemplateMotorcycles(MotorcyclesPage(data))}
      ></Route>
      <Route
        path="/add-motorcycle"
        element={TemplateAddMotorcycle(AddMotorcyclePage())}
      ></Route>
    </Routes>
  );
}
