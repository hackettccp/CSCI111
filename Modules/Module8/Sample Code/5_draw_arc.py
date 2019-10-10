"""
Demonstrates drawing arcs on a canvas.
"""
#Imports the tkinter module
import tkinter

def main() :
    #Creates the window
    test_window = tkinter.Tk()
    #Sets the window's title
    test_window.wm_title("Arc Example")

    #Creates the Canvas widget.
    canvas = tkinter.Canvas(test_window,
                            width=200,
                            height=200,
                            background="white")

    #Draws an arc
    canvas.create_arc(10, 10,
                      190, 190,
                      start=45,
                      extent=30,
                      fill="red")

    #Draws a second arc
    canvas.create_arc(20, 100,
                      100, 180,
                      start=35,
                      extent=295,
                      fill="yellow")
    
    #Packs the canvas onto the window
    canvas.pack()
        
    #Enters the main loop, displaying the window
    #and waiting for events
    tkinter.mainloop()

#Calls the main function
main()
