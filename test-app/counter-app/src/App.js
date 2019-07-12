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
    this.decrement = this.decrement.bind(this);
    this.reset = this.reset.bind(this);

  }

  increment(){
    this.setState({count: this.state.count +1})
  }

  decrement(){
    this.setState({count: this.state.count - 1})
  }

  reset(){
    this.setState({count: 0});
  }

  render(){
    return(
      <div>
        <p>
        counter value: {this.state.count}
        </p>
        <button className="increment" onClick={this.increment}>!!Increment Counter!!</button>
        <button className="decrement" onClick={this.decrement}>!!Decrement Counter!!</button>
        <button className="reset" onClick={this.reset}>!!Reset Counter!!</button>
      </div>
    );
  }
};
export default App;
