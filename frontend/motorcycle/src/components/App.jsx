import {Routes, Route} from 'react-router-dom';
import Landing from './organisms/Landing';
import TemplateLanding from './templates/TemplateLanding';

export default function App() {

  return (
    <Routes>
      <Route path='/' element={TemplateLanding(Landing())}></Route>
    </Routes>
  );
}
