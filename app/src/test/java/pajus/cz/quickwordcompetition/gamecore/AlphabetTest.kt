package pajus.cz.quickwordcompetition.gamecore

import io.kotlintest.matchers.startWith
import io.kotlintest.should
import org.junit.Test
import io.kotlintest.shouldBe
import io.kotlintest.shouldThrow
import java.lang.IllegalArgumentException

class AlphabetTest {

    @Test
    fun `Size of alphabet with ten letters`() {
        val alphabetWithThree = Alphabet("ABCDEFGHIJ")

        alphabetWithThree.size() shouldBe 10
    }

    @Test
    fun `Alphabet starting with lowercase letter`() {
        val alphabetLowercase = Alphabet("axBCDEFGHIJ")

        alphabetLowercase.size() shouldBe 9
        alphabetLowercase[1] shouldBe "B"
    }


    @Test
    fun `Size of alphabet with ten letters where one letter is multi-letter`() {
        val alphabetWithThree = Alphabet("ABCDEFGHChI")

        alphabetWithThree.size() shouldBe 10
    }

    @Test
    fun `Alphabet defined with no capital letters`() {
        //GIVEN
        val emptyAlphabet = Alphabet("abcderfvn")

        emptyAlphabet.size() shouldBe 0
    }

    @Test
    fun `Alphabed with capital national characters`() {
        val nationalAlphabet = Alphabet("ŠUaxRÚÖdaXW")

        nationalAlphabet.size() shouldBe 7
    }

    @Test
    fun `Get zero letter from Alphabet`() {
        val multiLetterAlphebet = Alphabet("AchoaUjaD")

        val exception = shouldThrow<IllegalArgumentException> {
            multiLetterAlphebet[0]
        }
        exception.message should startWith("Position of a letter must be positive number")
    }

    @Test
    fun `Get First multi-letter from alphabet`() {
        val multiLetterAlphebet = Alphabet("AChJouČeňdaENDXda")

        multiLetterAlphebet[1] shouldBe "A"
        multiLetterAlphebet[2] shouldBe "Ch"
        multiLetterAlphebet[3] shouldBe "Jou"
        multiLetterAlphebet[4] shouldBe "Čeňda"
        multiLetterAlphebet[5] shouldBe "E"
        multiLetterAlphebet[8] shouldBe "Xda"
    }

    @Test
    fun `More multi-letters with same prefix`()
    {
        val multiLetterAlphebet = Alphabet("ChChaChoChouh")

        multiLetterAlphebet.size() shouldBe 4
        multiLetterAlphebet[1] shouldBe "Ch"
        multiLetterAlphebet[2] shouldBe "Cha"
        multiLetterAlphebet[3] shouldBe "Cho"
        multiLetterAlphebet[4] shouldBe "Chouh"
    }


    @Test
    fun `Alphabet should not have duplicite letters`()
    {
        val exception = shouldThrow<IllegalArgumentException> {
            Alphabet("ABCDACD")
        }
        exception.message should startWith("Alphabet cannot have duplicate letters")
    }

    @Test
    fun `Alphabet should not have duplicite multi-letters`()
    {
        val exception = shouldThrow<IllegalArgumentException> {
            Alphabet("ABChšDAChšD")
        }
        exception.message should startWith("Alphabet cannot have duplicate letters")
    }

    @Test
    fun `Alphabet with digits`()
    {
        val exception = shouldThrow<IllegalArgumentException>
        {
            Alphabet("A1C")
        }
        exception.message should startWith("Alphabet can contain only Letters")
    }

    @Test
    fun `Alphabet with special character`()
    {
        val exception = shouldThrow<IllegalArgumentException>
        {
            Alphabet("asdAB!C")
        }
        exception.message should startWith("Alphabet can contain only Letters")
    }

    @Test
    fun `Czech alphabhet`()
    {
        val CzechAlphabet = Alphabets.CZECH

        CzechAlphabet.size() shouldBe 42
    }
}