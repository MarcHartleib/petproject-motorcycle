import {Routes, Route} from 'react-router-dom';
import { useState, useEffect } from 'react'
import LandingPage from './pages/LandingPage';
import MotorcyclesPage from './pages/MotorcyclesPage';
import TemplateLanding from './templates/TemplateLanding';
import TemplateMotorcycles from './templates/TemplateMotorcycles';

export default function App() {

  const [data, setData] = useState(null);

  useEffect(() => {
    const fetchData = async () => {
    const response = await fetch('/motorcycle');
    const newData = await response.json();
    setData(newData);
    };

    fetchData();
  }, []);

  return (
    <Routes>
      <Route path='/' element={TemplateLanding(LandingPage())}></Route>
      <Route path='/motorcycles' element={TemplateMotorcycles(MotorcyclesPage(data))}></Route>
    </Routes>
  );
}
