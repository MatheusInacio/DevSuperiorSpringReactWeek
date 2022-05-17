import githubIcon from '../../assets/img/github.svg';
import './styles.css';

export function Navbar() {
    return (
        <header>
            <nav className='container'>
                <div className='dsmovie-nav-content d-flex justify-content-between'>
                    <h1 className='p-2 m-0 font-weight-bolder text-white align-middle'>DSMovie</h1>
                    <a href="https://github.com/MatheusInacio/" className='p-2'>
                        <div className='d-flex justify-content-center contact'>
                            <img src={githubIcon} />
                            <p className='text-white align-middle m-2'>/MatheusInacio</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    );
}
