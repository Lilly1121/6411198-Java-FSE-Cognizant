// src/App.js
import React, { Component } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

class App extends Component {
  constructor() {
    super();
    this.state = {
      count: 5,
    };
  }

  // Method to increment count and say hello
  handleIncrement = () => {
    this.setState({ count: this.state.count + 1 });
    alert("Hello! Member1");
  };

  // Method to decrement count
  handleDecrement = () => {
    this.setState({ count: this.state.count - 1 });
  };

  // Method with argument
  sayWelcome = (message) => {
    alert(message);
  };

  // Synthetic Event example
  handleClick = (e) => {
    alert("I was clicked");
  };

  render() {
    return (
      <div style={{ margin: "20px" }}>
        <p>{this.state.count}</p>

        <button onClick={this.handleIncrement}>Increment</button> <br /><br />
        <button onClick={this.handleDecrement}>Decrement</button> <br /><br />
        <button onClick={() => this.sayWelcome("welcome")}>Say welcome</button> <br /><br />
        <button onClick={this.handleClick}>Click on me</button> <br /><br />

        <CurrencyConvertor />
      </div>
    );
  }
}

export default App;
