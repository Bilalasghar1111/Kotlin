fun main() {
    // Function to calculate percentage
    fun calculatePercentage(obtainedMarks: Int, totalMarks: Int): Double {
        return (obtainedMarks.toDouble() / totalMarks) * 100
    }

    // Input: Obtained marks and total marks for each subject
    val subject1ObtainedMarks = 85
    val subject1TotalMarks = 100

    val subject2ObtainedMarks = 90
    val subject2TotalMarks = 100

    val subject3ObtainedMarks = 78
    val subject3TotalMarks = 100

    // Calculate percentage for each subject
    val subject1Percentage = calculatePercentage(subject1ObtainedMarks, subject1TotalMarks)
    val subject2Percentage = calculatePercentage(subject2ObtainedMarks, subject2TotalMarks)
    val subject3Percentage = calculatePercentage(subject3ObtainedMarks, subject3TotalMarks)

    // Calculate overall percentage
    val overallPercentage = (subject1Percentage + subject2Percentage + subject3Percentage) / 3

    // Display results
    println("Subject 1 Percentage: $subject1Percentage%")
    println("Subject 2 Percentage: $subject2Percentage%")
    println("Subject 3 Percentage: $subject3Percentage%")
    println("Overall Percentage: $overallPercentage%")
}
