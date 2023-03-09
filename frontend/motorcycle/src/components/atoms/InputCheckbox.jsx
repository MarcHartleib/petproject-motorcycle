export default function InputCheckbox({ data }) {
    return (
        <input type="checkbox" id={data.name} defaultChecked={data.checked}/>
    )
}