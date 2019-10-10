"""
Demonstrates drawing a polygon on a canvas.
"""
#Imports the tkinter module
import tkinter

def main() :
    #Creates the window
    test_window = tkinter.Tk()
    #Sets the window's title
    test_window.wm_title("Polygon Example 2")

    #Creates the Canvas widget.
    canvas = tkinter.Canvas(test_window,
                            width=160,
                            height=160,
                            background="white")

    #Draws a polygon (pentagon).
    canvas.create_polygon(80, 20,
                          20, 70,
                          40, 140,
                          120, 140,
                          140, 70,
                          80, 20,
                          fill="green")
        
    #Packs the canvas onto the window
    canvas.pack()
        
    #Enters the main loop, displaying the window
    #and waiting for events
    tkinter.mainloop()

#Calls the main function
main()
