const mario = document.querySelector('.mario')

const pipe = document.querySelector('.pipe')
const jump = () => {
    mario.classList.add('jump');
    setTimeout(() => {
        mario.classList.remove('jump');
    }, 500);
};

document.addEventListener('keydown', jump)

const loop = setInterval(()=>{
    const pipePosition = pipe.offsetLeft
    const marioPosition = +getComputedStyle(mario).bottom.replace(`px`,"")
    const clouds = document.querySelector(".clouds");
    const cloudsPosition = clouds.offsetLeft;

    if(pipePosition <= 120 && pipePosition > 0 && marioPosition < 110){
        pipe.style.animation = 'none'
        pipe.style.left = `${pipePosition}px`

        mario.style.animation = `none`
        mario.style.bottom = `${marioPosition}px`

        mario.src = './images/game-over.png'
        mario.style.width = '75px'
        mario.style.marginLeft = '50px'

        clouds.style.animation = "none";
        clouds.style.left = `${cloudsPosition}px`
        clearInterval(loop)
    }

}, 10)