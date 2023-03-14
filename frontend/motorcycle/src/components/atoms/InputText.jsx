export default function InputText({ id, onChange, data }) {
  return (
    <input id={id} type="text" onChange={onChange} defaultValue={data}></input>
  );
}
