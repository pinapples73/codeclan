import React, { Component, Fragment } from 'react';
import NewsList from '../components/NewsList';
import NewsFilter from '../components/NewsFilter';


class NewsContainer extends Component {
  constructor(props){
    super(props);
    this.state = {
      storiesDetail: [],
      selectedIndex: null,
      selectedStory: []
    }
    this.handleStorySelected = this.handleStorySelected.bind(this)
  }

  handleStorySelected(index){
    index = parseInt(index);
    this.setState({ selectedIndex: index });
    const selected = this.state.storiesDetail[index];
    this.setState({ selectedStory: selected});
  }

    render(){


        return (
          <Fragment>
          <NewsFilter stories = {this.state.storiesDetail} onStorySelected = {this.handleStorySelected}/>
          <br></br>
          <NewsList selectedStory = {this.state.selectedStory} stories = {this.state.storiesDetail}/>
          </Fragment>
        )
    };

    componentDidMount(){
      const listUrl = "https://hacker-news.firebaseio.com/v0/topstories.json"

      fetch(listUrl)
      .then(response => response.json())
      .then((news) => {
        const promises = news.slice(0,19).map((storyId, index) => {
          return fetch(`https://hacker-news.firebaseio.com/v0/item/${storyId}.json`)
          .then(response => response.json())
        })
        Promise.all(promises)
        .then(storiesDetail => this.setState({ storiesDetail: storiesDetail }))
      })
      .catch(err => console.error)
    }

}

export default NewsContainer;
