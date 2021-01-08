"""
Demonstrates drawing circles/ovals on a canvas.
"""
#Imports the tkinter module
import tkinter

def main() :
    #Creates the window
    test_window = tkinter.Tk()
    #Sets the window's title
    test_window.wm_title("Circle/Oval Example")

    #Creates the Canvas widget.
    canvas = tkinter.Canvas(test_window,
                            width=200,
                            height=200,
                            background="white")

    #Draws a circle
    canvas.create_oval(20, 20,
                       70, 70,
                       fill="blue")

    #Draws an oval
    canvas.create_oval(100, 100,
                       180, 130,
                       fill="green")
    
    #Packs the canvas onto the window
    canvas.pack()
        
    #Enters the main loop, displaying the window
    #and waiting for events
    tkinter.mainloop()

#Calls the main function
main()
