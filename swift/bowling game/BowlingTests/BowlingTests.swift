//
//  BowlingTests.swift
//  BowlingTests
//
//  Created by Douglas de Oliveira Mendes on 01/12/22.
//

import XCTest

@testable import Bowling

final class BowlingTests: XCTestCase {
    var game: Bowling = Bowling()

    override func setUpWithError() throws {
        game = Bowling()
    }

    override func tearDownWithError() throws {
        // Put teardown code here. This method is called after the invocation of each test method in the class.
    }

    func testSinglePinThrow() throws {
        game.roll(pins: 3)
        XCTAssertEqual(3, game.score())
    }
    
//    func testGuggerGame() throws {
//        XCTFail("Not implemented")
//    }
//
//    func testOneSpare() throws {
//        XCTFail("Not implemented")
//    }
//
//    func testOneStrike() throws {
//        XCTFail("Not implemented")
//    }
//
//    func testPerfectGame() throws {
//        XCTFail("Not implemented")
//    }
//
//    func testDutch200Even() throws {
//        XCTFail("Not implemented")
//    }
//
//    func testDutch200Odd() throws {
//        XCTFail("Not implemented")
//    }
//
//    func testNineSpareGame() throws {
//        XCTFail("Not implemented")
//    }
}
