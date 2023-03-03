import LandingPageButton from "../atoms/LandingPageButton";

export default function Landing() {
    return (
        <div>
            <LandingPageButton name={'Motorcycles'}/>
            <LandingPageButton name={'Add motorcycle'}/>
            <LandingPageButton name={'Logout'}/>
        </div>
    )
}