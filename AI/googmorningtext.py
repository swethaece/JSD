import pyttsx3
#import datetime
print("module pyttsx3 accepted")
#engine=pyttsx3.init("sapi5")
#voices=engine.getProperty('voices')
#engine.setProperty('voice', voices[0].id)
#engine.say("hi...................hai good morning")
#engine.runAndWait()

def speak(text):
   engine = pyttsx3.init('sapi5')
   voices = engine.getProperty('voices')
   engine.setProperty('voice', voices[0].id)
   engine.say(" hi          ...... hai "+text+"  how r u?")
   engine.runAndWait()
   engine.stop()

#hour = int(datetime.datetime.now().hour)
hour=int(input("enter hour"))
if hour>=0 and hour<=12:
    speak("Good Morning               how r u?!")

elif hour>12 and hour<=16:
    speak("Good Afternoon!")   

elif hour>16 and hour<=17:
    speak("Good Evening!")  
else:
    speak("good night.... sleep well!")