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

    #Draws two lines.
    canvas.create_line(0, 0,
                       200, 200)
    
    canvas.create_line(200, 0,
                       0, 200)
    
    #Packs the canvas onto the window
    canvas.pack()
        
    #Enters the main loop, displaying the window
    #and waiting for events
    tkinter.mainloop()

#Calls the main function
main()
