import {Routes, Route} from 'react-router-dom';
import LandingPage from './pages/LandingPage';
import MotorcyclesPage from './pages/MotorcyclesPage';
import TemplateLanding from './templates/TemplateLanding';
import TemplateMotorcycles from './templates/TemplateMotorcycles';

export default function App() {

  return (
    <Routes>
      <Route path='/' element={TemplateLanding(LandingPage())}></Route>
      <Route path='/motorcycles' element={TemplateMotorcycles(MotorcyclesPage())}></Route>
    </Routes>
  );
}
