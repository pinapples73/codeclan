import React from 'react';

const NewsFilter = (props) => {

    if(props.stories) {
      const options = props.stories.map((story,index) => {
        return <option value = {(index)} key = {story.id}> {story.title} </option>
      })

      function handleChange(event){
        props.onStorySelected(event.target.value)
      }

      return (
        <select id="story-selector" defaultValue="default" onChange={handleChange}>
          <option disable value = "default">Choose a story...</option>
          {options}
        </select>
      )

    }


}

export default NewsFilter;
