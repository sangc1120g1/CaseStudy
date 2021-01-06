let music = new Audio('musiccar.mp3')
music.loop = true
let music1 = new Audio('music1.mp3')
let musiccoin = new Audio('coin.mp3')
let a = new Image()
a.src = 'road.png'
let a2 = new Image()
a2.src = 'road.png'
let b = new Image()
b.src = 'car.png'
let an = new Image()
an.src = 'animal.png'
let co = new Image()
co.src = 'coin.png'
let an_wight = 40
let an_height = 70
let c = document.getElementById('c1')
let ctx = c.getContext('2d')
let canvas_height = 650
let canvas_wight = 500
let car_wight = 40
let car_height = 90
let countc = 0
let count = 0
let coin_size = 40
let roady = 0
let roady2 = -650
let clicks = 0
let Wins = true
function colors() {
    clicks++
    if (clicks % 2 != 0) {
        document.getElementById("p1").style.color = "black"
    } else {
        document.getElementById("p1").style.color = "blue"
    }
}

function road(a, y, wight, height) {
    ctx.drawImage(a, 0, y, wight, height)
}

function car(x, y) {
    this.x = x
    this.y = y
    this.speed = 18
    this.cars = function () {
        ctx.drawImage(b, this.x, this.y, 50, 100)
    }
    this.move = function (number) {
        switch (number) {
            case 37:
                this.x -= this.speed
                break;
            case 38:
                this.y -= this.speed
                break;
            case 39:
                this.x += this.speed
                break;
            case 40:
                this.y += this.speed
                break;
            case 32:
                this.speed += 2
                break;
        }
        if (this.x < 0) {
            this.x = 0
        } else if (this.x > (canvas_wight - car_wight)) {
            this.x = canvas_wight - car_wight
        }
        if (this.y < 0) {
            this.y = 0
        } else if (this.y > (canvas_height - car_height)) {
            this.y = canvas_height - car_height
        }
        if (this.speed > 33) {
            this.speed -= 2
        }
    }
}

function coin(x, y) {
    this.x = x
    this.y = y
    this.speed = 5
    this.draw = function () {
        ctx.drawImage(co, this.x, this.y, 40, 40)
    }
    this.cmove = function () {
        this.y += this.speed
        countc++
        if (this.y > canvas_height && countc % 200 == 0) {
            this.y = 0
            this.x = Math.floor(Math.random() * (480 - 30)) + 30;
            countc = 1
            this.speed++
        }
        if (this.speed > 12) {
        }
    }
}

function animal(x, y) {
    this.x = x
    this.y = y
    this.speed = 5
    this.animals = function () {
        ctx.drawImage(an, this.x, this.y, 50, 80)
    }
    this.amove = function (a, b, c) {
        this.y += this.speed
        if (this.y > canvas_height) {
            this.y = c
            this.x = Math.floor(Math.random() * (b - a)) + a
            this.speed += 1
        }
        if (this.speed > 17) {
            this.speed -= 1
        }
    }
}

let mycar = new car(200, 540)
let animals1 = new animal(Math.floor(Math.random() * (480 - 30) + 30), Math.random() * 40)
let animals2 = new animal(Math.floor(Math.random() * (480 - 30) + 30), Math.random() * 40)
let animals3 = new animal(Math.floor(Math.random() * (480 - 30) + 30), Math.random() * 40)
let mycoin = new coin(Math.floor(Math.random() * (480 - 30)) + 30, 0)

function game() {
    this.Update = function () {
        ctx.clearRect(0, 0, 500, 650)
        if (roady == 650) {
            roady = -650
        }
        if (roady2 == 650) {
            roady2 = -650
        }
        roady += 50
        roady2 += 50
        road(a, roady, 500, 650)
        road(a2, roady2, 500, 650)
        mycar.cars()
        animals1.animals()
        animals2.animals()
        animals3.animals()
        animals1.amove(10, 140, Math.floor(Math.random() * 40))
        animals2.amove(160, 210, Math.random() * 40)
        animals3.amove(240, 460, Math.random() * 40)
        check()
    }
    this.runs = function (event) {
        if (Wins == true) {
            music.play()
            switch (event.keyCode) {
                case 38:
                case 87:
                    mycar.move(38)
                    break;
                case 37:
                case 65:
                    mycar.move(37)
                    break;
                case 39:
                case 68:
                    mycar.move(39)
                    break;
                case 40:
                case 83:
                    mycar.move(40)
                    break;
                case 32:
                    mycar.move(32)
                    break;
            }
        }
    }
    this.coin = function () {
        mycoin.draw()
        mycoin.cmove()
    }

    this.Setin = setInterval(this.Update, 30)
    this.Setcoin = setInterval(this.coin, 30)
}

let mygame = new game()
    function Restart(e) {
        switch (e.keyCode) {
            case 13:
                location.reload()
                count += 0
                break;
        }
    }
function check() {
    var isStoped = ((mycar.x > (animals1.x + an_wight)) || (mycar.y > (animals1.y + an_height)))
        || (((mycar.x + car_wight) < animals1.x) || (mycar.y + car_height) < animals1.y)
    var isStoped1 = ((mycar.x > (animals2.x + an_wight)) || (mycar.y > (animals2.y + an_height)))
        || (((mycar.x + car_wight) < animals2.x) || (mycar.y + car_height) < animals2.y)
    var isStoped2 = ((mycar.x > (animals3.x + an_wight)) || (mycar.y > (animals3.y + an_height)))
        || (((mycar.x + car_wight) < animals3.x) || (mycar.y + car_height) < animals3.y)
    var isStoped3 = ((mycar.x > (mycoin.x + coin_size)) || (mycar.y > (mycoin.y + coin_size)))
        || (((mycar.x + car_wight) < mycoin.x) || (mycar.y + car_height) < mycoin.y)
    if (isStoped && isStoped1 && isStoped2) {
        mygame.Setin
    } else {
        music1.play()
        music.pause()
        Wins = false
        clearInterval(mygame.Setin)
        clearInterval(mygame.Setcoin)
    }
    if (isStoped3) {
        mygame.Setcoin
    } else {
        musiccoin.play()
        mycoin.y = -650
        count += animals1.speed
    }
    document.getElementById('coin').innerHTML = "your soccer: "+ count
}
