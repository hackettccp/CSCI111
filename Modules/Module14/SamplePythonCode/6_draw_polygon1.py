"""
Demonstrates drawing a polygon on a canvas.
"""
#Imports the tkinter module
import tkinter

def main() :
    #Creates the window
    test_window = tkinter.Tk()
    #Sets the window's title
    test_window.wm_title("Polygon Example 1")

    #Creates the Canvas.
    canvas = tkinter.Canvas(test_window,
                            width=160,
                            height=160,
                            background="white")

    #Draws a polygon (triangle).
    canvas.create_polygon(40, 120,
                          120, 120,
                          80, 40,
                          40, 120,
                          fill="blue")
        
    #Packs the canvas onto the window
    canvas.pack()
        
    #Enters the main loop, displaying the window
    #and waiting for events
    tkinter.mainloop()

#Calls the main function
main()
