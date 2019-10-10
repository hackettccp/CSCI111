"""
Demonstrates drawing rectangles on a canvas.
"""
#Imports the tkinter module
import tkinter

def main() :
    #Creates the window
    test_window = tkinter.Tk()
    #Sets the window's title
    test_window.wm_title("Rectangle Example")

    #Creates the Canvas widget.
    canvas = tkinter.Canvas(test_window,
                            width=200,
                            height=200,
                            background="white")

    #Draws a rectangle (square).
    canvas.create_rectangle(40, 40,
                            100, 100,
                            fill="red")

    #Draws a rectangle.
    canvas.create_rectangle(120, 40,
                            160, 120,
                            fill="green")

    #Draws a rectangle.
    canvas.create_rectangle(20, 140,
                            180, 180,
                            fill="blue")
    
    #Packs the canvas onto the window
    canvas.pack()
        
    #Enters the main loop, displaying the window
    #and waiting for events
    tkinter.mainloop()

#Calls the main function
main()

