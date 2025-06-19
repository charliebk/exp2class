' SELECT TYPE IfcColour
' Options:
' - IfcColourSpecification
' - IfcPreDefinedColour
Public Class IfcColour
    Public ReadOnly Property Value As Object

    Public Sub New(value As Object)
        If Not (TypeOf value Is IfcColourSpecification OrElse TypeOf value Is IfcPreDefinedColour) Then
            Throw New ArgumentException("Value must be one of: IfcColourSpecification, IfcPreDefinedColour")
        End If
        Me.Value = value
    End Sub

    Public Function GetValueAs(Of T)() As T
        Return CType(Value, T)
    End Function
End Class
