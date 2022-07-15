export default class VideoControler{
    videos = [
        {
            src: 'https://www.youtube.com/embed/XVkADAwOXnU?autoplay=1',
            title: 'Aquario 1'
        },
        {
            src: 'https://www.youtube.com/embed/75lhLxl6DW4?autoplay=1',
            title: 'Aquario 2'
        },
        {
            src: 'https://www.youtube.com/embed/iesgrvt2ngw?autoplay=1',
            title: 'Aquario 3'
        },
    ]
    i = 0

    getCurrentVideo(){
        return this.videos[this.i]
    }
    getNextVideo(){
        if(this.i + 1 < this.videos.length)
            return this.videos[++this.i]
        else
            return this.videos[this.i]
    }
    getPreviousVideo(){
        if(this.i - 1 >= 0)
            return this.videos[--this.i]
        else
            return this.videos[this.i]
    }
}
