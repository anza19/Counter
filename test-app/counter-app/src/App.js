import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

class App extends Component{
  constructor(){
    super();

    this.state = {
      count: 0
    };

    this.increment = this.increment.bind(this);
  }

  increment(){
    this.setState({count: this.state.count +1})
  }

  render(){
    return(
      <div>
        <p>
        counter value: {this.state.count}
        </p>
        <button className="increment" onClick={this.increment}>!!Increment Counter!!</button>
      </div>
    );
  }
};
export default App;
