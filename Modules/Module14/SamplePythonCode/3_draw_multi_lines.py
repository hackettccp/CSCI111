"""
Demonstrates drawing lines on a canvas.
"""
#Imports the tkinter module
import tkinter

def main() :
    #Creates the window
    test_window = tkinter.Tk()
    #Sets the window's title
    test_window.wm_title("Line Example")

    #Creates the Canvas widget.
    canvas = tkinter.Canvas(test_window,
                            width=200,
                            height=200,
                            background="white")

    #Draws a line, connecting multiple points.
    canvas.create_line(10, 10,
                       189, 10,
                       100, 189,
                       10, 10)
    
    #Packs the canvas onto the window
    canvas.pack()
        
    #Enters the main loop, displaying the window
    #and waiting for events
    tkinter.mainloop()

#Calls the main function
main()

