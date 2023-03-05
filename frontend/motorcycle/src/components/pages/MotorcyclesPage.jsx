import { useState, useEffect } from 'react';
import LinkButton from "../atoms/LinkButton";
import NavBar from "../organisms/NavBar";
import Motorcycle from '../atoms/Motorcycle';

export default function MotorcyclesPage () {
    const [data, setData] = useState(null);

    useEffect(() => {
      const fetchData = async () => {
      const response = await fetch('/motorcycle');
      const newData = await response.json();
      setData(newData);
      };
  
      fetchData();
    }, []);

    if (data === null) {
        return (
        <div>
            <NavBar>
                <LinkButton name={'Home'} pageLink={'/'}/>
                <LinkButton name={'Logout'}/>
            </NavBar>
            <p>No Data</p>
        </div>

        )
    } else {

    return (
        <div>
            <NavBar>
                <LinkButton name={'Home'} pageLink={'/'}/>
                <LinkButton name={'Logout'}/>
            </NavBar>
            {data.map((mocy) => (
                <Motorcycle key={mocy.id} mocy={mocy}/>
            ))}
        </div>
    )
        }
}