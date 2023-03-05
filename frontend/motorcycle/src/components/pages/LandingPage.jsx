import LinkButton from "../atoms/LinkButton";
import Landing from "../organisms/Landing";

export default function LandingPage() {
    return (
        <div>
            <Landing>
                <LinkButton name={'Motorcycles'} pageLink={'/motorcycles'}/>
                <LinkButton name={'Add Motorcycle'}/>
                <LinkButton name={'Logout'}/>
            </Landing>
        </div>
    )
}