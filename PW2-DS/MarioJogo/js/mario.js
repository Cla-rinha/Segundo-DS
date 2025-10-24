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
    console.log(pipePosition)

    if(pipePosition <= 120){
        pipe.style.animation = 'none'
    }

}, 10)