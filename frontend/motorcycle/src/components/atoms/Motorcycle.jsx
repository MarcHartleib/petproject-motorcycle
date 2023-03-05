export default function Motorcycle({ mocy }) {
    return (
            <ul>
                <li>{mocy.manufacturer}</li>
                <li>{mocy.modelType}</li>
                <li>{mocy.name}</li>
                <li>{mocy.productionYear}</li>
                <li>{mocy.engine}</li>
                <li>{mocy.displacement}</li>
                <li>{mocy.cooling}</li>
                <li>{mocy.horsepower}</li>
                <li>{mocy.drive}</li>
                <li>{mocy.fuelCapacity}</li>
                <li>used {mocy.used ? '✔' : '❌'}</li>
            </ul>
    )
}