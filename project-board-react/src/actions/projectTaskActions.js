import axios from "axios";
import { GET_ERRORS } from "./types";
export const addProjectTask = (project_task, history) => async (dispach) => {
  try {
    await axios.post("http://localhost:8080/api/board", project_task);
    history.push("/");
    dispach({
      type: GET_ERRORS,
      payload: {},
    });
  } catch (error) {
    dispach({
      type: GET_ERRORS,
      payload: error.response.data,
    });
  }
};
