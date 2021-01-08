"""
Demonstrates drawing text on a canvas.
"""
#Imports the tkinter module
import tkinter

def main() :
    #Creates the window
    test_window = tkinter.Tk()
    #Sets the window's title
    test_window.wm_title("Text Example 1")

    #Creates the Canvas widget.
    canvas = tkinter.Canvas(test_window,
                            width=160,
                            height=160,
                            background="white")

    #Display text in the upper left of the canvas.
    canvas.create_text(40, 30,
                       text="Hello World 1")

    #Display text in the center of the canvas.
    canvas.create_text(80, 80,
                       text="Hello World 2")

    #Display text in the lower right of the canvas.
    canvas.create_text(120, 130,
                       text="Hello World 3")
    
    #Packs the canvas onto the window
    canvas.pack()
        
    #Enters the main loop, displaying the window
    #and waiting for events
    tkinter.mainloop()

#Calls the main function
main()
