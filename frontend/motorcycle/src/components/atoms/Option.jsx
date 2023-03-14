export default function Option({ id, options, onChange, data }) {
  return (
    <select id={id} defaultValue={data ? data : options[0]} onChange={onChange}>
      <option value="">--Choose an option--</option>
      {options.map((option, index) => (
        <option key={index} value={option.toUpperCase()}>
          {option}
        </option>
      ))}
    </select>
  );
}
