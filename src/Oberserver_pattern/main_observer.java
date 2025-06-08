package Oberserver_pattern;

public class main_observer {
        public static void main(String[] args) {
                youtubechannel channel = new youtubechannel();
                observer user1 = new subscriber("alice");
                observer user2 = new subscriber("Bob");

                channel.register(user1);
                channel.register(user2);

                channel.addvideo("observer pattern in java");

        }
}

/*
✅ Definition:
The Observer Pattern is a behavioral design pattern in which an object (called the Subject) maintains a list of its dependents, called Observers, and notifies them automatically of any state changes, usually by calling one of their methods.

🧠 Simple Real-Life Example:
Imagine you subscribe to a YouTube channel.
When the channel uploads a new video, you get notified.
In this case:

You are the Observer.

The YouTube channel is the Subject.

When the channel’s state changes (new video), all subscribers (observers) are notified.

🧩 Key Components:
Role	Description
Subject	The core object whose state is observed. It maintains a list of observers.
Observers	Objects that want to be notified when the subject’s state changes.
Attach/Register	Observers are added to the subject’s list.
Notify	When the subject’s state changes, it calls a method on all registered observers.

💡 When to Use Observer Pattern:
When multiple objects need to be updated when one object changes.

When a one-to-many relationship is needed (1 subject → many observers).

Common in event handling systems, publish/subscribe systems, UI frameworks, notification systems, etc.

🎯 Real-World Examples:
Scenario	Subject	Observers
YouTube Subscriptions	YouTube Channel	Subscribers (users)
Stock Market App	Stock Price Feed	Investor Dashboards
Weather App	Weather Station	Mobile Weather Widgets
Social Media	Instagram User Account	Followers
Event Bus (e.g. in GUIs)	Button or Event Source	Event listeners

🧾 Summary:
The Observer Pattern helps decouple the subject and the observers.

The subject doesn't need to know who the observers are or how they work.

It's a way to achieve flexible and scalable communication between components.
 */
