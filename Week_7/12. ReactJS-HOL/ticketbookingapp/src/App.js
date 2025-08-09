import React, { useState } from "react";

// Component to display when user is logged in
function UserGreeting() {
  return <h1>Welcome back</h1>;
}

// Component to display when user is not logged in
function GuestGreeting() {
  return <h1>Please sign up.</h1>;
}

// Greeting component to choose between User or Guest greeting
function Greeting(props) {
  const isLoggedIn = props.isLoggedIn;
  if (isLoggedIn) {
    return <UserGreeting />;
  }
  return <GuestGreeting />;
}

// Login Button Component
function LoginButton(props) {
  return (
    <button onClick={props.onClick}>
      Login
    </button>
  );
}

// Logout Button Component
function LogoutButton(props) {
  return (
    <button onClick={props.onClick}>
      Logout
    </button>
  );
}

// Main App Component
function App() {
  // Login state
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  // Button click handlers
  const handleLoginClick = () => setIsLoggedIn(true);
  const handleLogoutClick = () => setIsLoggedIn(false);

  // Determine which button to show
  let button;
  if (isLoggedIn) {
    button = <LogoutButton onClick={handleLogoutClick} />;
  } else {
    button = <LoginButton onClick={handleLoginClick} />;
  }

  return (
    <div>
      <Greeting isLoggedIn={isLoggedIn} />
      {button}
    </div>
  );
}

export default App;
