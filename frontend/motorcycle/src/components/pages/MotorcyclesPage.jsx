import LinkButton from "../atoms/LinkButton";
import NavBar from "../organisms/NavBar";

export default function MotorcyclesPage ({ data }) {
    return (
        <div>
            <NavBar>
                <LinkButton name={'Home'} pageLink={'/'}/>
                <LinkButton name={'Logout'}/>
            </NavBar>
        </div>
    )
}