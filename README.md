![ Screenshot of Echo LIVE! ](http://i64.tinypic.com/o881e8.png)
# Echo
Ever lost your phone and couldn't track it down because it was not on wifi?  Fret no more!  Echo is a cloud-based mobile app that crowdsources your missing phone's location by sending out a wifi hotspot when your phone hasn't been used for a period of time of your choice!  

## What It Does
Tasker keeps track of how long your phone has been off WiFi and if it exceeds a pre-defined amount based on the individual user profile, it turns on its mobile WiFi hotspot.  This hotspot contains a UID that can be picked up by other users in the area.   Each of these users then upload their GPS location onto the Cloud.  This is displayed neatly using the Google Maps API and provides a good indication of the location of the missing phone.

## How We Built It
Front-End: HTML, CSS, Node.js, PhoneGap
Back-End: Azure, Linode, PHP, MySQL, Apache

## Challenges We Ran Into
None of us had any experience with back-end so we had a huge learning curve we had to conquer to build our project
Furthermore, we had quite a small team, so on top of having a lack of variety, we lacked the manpower to be able to "divide and conquer".

## Accomplishments We Are Proud Of
Despite the fact that we all came into the hackathon not knowing a single thing about back-end,  we were surprised to have made such huge progress with learning all the various languages and APIs available for back-end programming.

## What We Learned
It doesn't matter how much you know about programming, all that matters is the passion and tenacity to be driven to keep learning no matter how daunting the challenge may seem!  Also, you don't have to be afraid to ask others for help!  We owe a lot to the friendliness and patience of the mentors and fellow coders for teaching us a thing or two about back-end!

## What's Next For Echo
- Introduce proximity/strength of WiFi signals to give a more accurate approximation of the location of the phone
- Implement timestamps to provide an extra dimensional variable which will be really useful for moving (stolen) phones
