// src/CurrencyConvertor.js
import React, { Component } from 'react';

class CurrencyConvertor extends Component {
  constructor() {
    super();
    this.state = {
      amount: '',
      currency: ''
    };
  }

  handleChange = (e) => {
    this.setState({
      [e.target.name]: e.target.value
    });
  };

  handleSubmit = (e) => {
    e.preventDefault();
    const rupees = this.state.amount;
    const currency = this.state.currency;
    const convertedAmount = rupees * 80; // Assuming 1 Euro = ₹80

    alert(`Converting to  ${currency} Amount is ${convertedAmount}`);
  };

  render() {
    return (
      <div style={{ marginTop: "40px" }}>
        <h1 style={{ color: "green" }}>Currency Convertor!!!</h1>

        <form onSubmit={this.handleSubmit}>
          <label>Amount: </label>
          <input
            type="text"
            name="amount"
            value={this.state.amount}
            onChange={this.handleChange}
          />
          <br /><br />

          <label>Currency: </label>
          <textarea
            name="currency"
            value={this.state.currency}
            onChange={this.handleChange}
          />
          <br /><br />

          <button type="submit">Submit</button>
        </form>
      </div>
    );
  }
}

export default CurrencyConvertor;
